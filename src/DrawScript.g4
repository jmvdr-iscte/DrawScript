grammar DrawScript;

script: constantList delimiter propertyList delimiter instructionList;

constantList: constant | constantList constant;

propertyList : property | propertyList property;

instructionList: instruction | instructionList instruction;

instruction: declaration | controlStructure;

controlStructure: ifStatement | forLoop;

ifStatement: 'if' expression instructionList ENDINSTRUCTION;

forLoop: 'for' PROPERTYID 'in' interval instructionList ENDINSTRUCTION;

property: propid = PROPERTYID ':' (dimension|background);

dimension: expression PROPERTYSEPARATOR expression;

background: expression;

declaration : id=PROPERTYID  (expression|(r g b));

constant: constid=ID ':' constval=value;

expression: ID|N|PROPERTYID|
                (OPENPARENTESIS expression CLOSEDPARENTESIS)|
                expression PLUS expression|
                expression MINUS expression|
                expression DIVIDE expression|
                expression TIMES expression|
                expression MOD expression|
                expression EQUALS expression;


interval: '[' expression INTERVALSEPARATION expression '[';

value:ID|N|(r g? b?);

delimiter: '---';

r:COLOR;
g:COLOR;
b:COLOR;

PROPERTYID: [a-z]+;
ID:[A-Z]+;
N: [0-9]+;
COLOR:  '|'? [0-9]+ '|'?;
WS: [ \t\r\n]+ -> skip;
PLUS:'+';
MINUS:'-';
TIMES:'*';
DIVIDE:'/';
MOD: '%';
PROPERTYSEPARATOR: '~';
ENDINSTRUCTION: '_';
INTERVALSEPARATION: ',';
EQUALS: '=';
OPENPARENTESIS:'(';
CLOSEDPARENTESIS:')';
