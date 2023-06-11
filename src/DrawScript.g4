grammar DrawScript;

script: constantList delimiter (propertyList delimiter)? instructionList;

constantList: constant | constantList constant;

propertyList : property | propertyList property;

instructionList: instruction | instructionList instruction;

instruction: declaration | controlStructure | figure;

figure: id= PROPERTYID() localization = expression INTERVALSEPARATOR expression shape= figureshape;

figureshape: singleparameter | doubleparameter ;

singleparameter: expression;

doubleparameter: expression PROPERTYSEPARATOR  expression;

controlStructure: ifStatement | forLoop;

ifStatement: 'if' expression instructionList  ('else' instructionList )? ENDINSTRUCTION;

forLoop: 'for' PROPERTYID 'in' interval instructionList ENDINSTRUCTION;

property: propid = PROPERTYID ':' (dimension|background);

dimension: expression PROPERTYSEPARATOR expression;

background: ID;

declaration : id=PROPERTYID  decvalue;

decvalue : expression|(r g b);

constant: constid=ID ':' constval=value;

expression: ID|N|PROPERTYID|
                OPENPARENTESIS expression CLOSEDPARENTESIS expression|

                expression DIVIDE expression|
                expression TIMES expression|
                expression PLUS expression|
                expression MINUS expression|
                expression MOD expression|
                expression LARGER expression|
                expression LESS expression|

                expression EQUALS expression;


interval: '[' expression INTERVALSEPARATOR expression '[';

value:ID|N|(r g? b?);

delimiter: '---';

r:COLOR;
g:COLOR;
b:COLOR;

PROPERTYID: [a-z]+;
ID:[A-Z]+;
N: [0-9]+;
COLOR:  '|'? [0-9]+ '|'?;
PLUS:'+';
MINUS:'-';
TIMES:'*';
DIVIDE:'/';
MOD: '%';
EQUALS: '=';
LARGER: '>';
LESS: '<';
WS: [ \t\r\n]+ -> skip;
PROPERTYSEPARATOR: '~';
ENDINSTRUCTION: '_';
INTERVALSEPARATOR: ',';
OPENPARENTESIS:'(' ->skip;
CLOSEDPARENTESIS:')' -> skip;
