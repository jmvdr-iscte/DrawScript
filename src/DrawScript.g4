grammar DrawScript;

script: constantList delimiter propertyList delimiter instructionList;

constantList: constant | constantList constant;

propertyList : property | propertyList property;

instructionList: instruction | instructionList instruction;

property: propid = PROPERTYID ':' (dimension|background);

dimension: expression PROPERTYSEPARATOR expression;

background: expression;

instruction : declaration;//| forLoop ;// |ifStatement | elseStatement | geometricobjectsdec| ENDINSTRUCTION;

//ifStatement: 'if' condition EQUALS conditionResult = (N | ID | PROPERTYID);

elseStatement: 'else';

declaration : id=PROPERTYID  (expression|(r g b));

//geometricobjectsdec: id = PROPERTYID geometricobjects;

constant: constid=ID ':' constval=value;

//geometricobjects: xexpression INTERVALSEPARATION yexpression;

//xexpression:(ID|PROPERTYID|N) ((OPERATOR|PROPERTYSEPARATOR)? (ID|N|PROPERTYID))*;

//yexpression: (ID|PROPERTYID|N) ((OPERATOR|PROPERTYSEPARATOR)? (ID|N|PROPERTYID))*;

forLoop: 'for' PROPERTYID 'in' interval;


linevalue : LINECOLOR;

expression: ID|N|
                expression PLUS expression|
                expression MINUS expression|
                expression DIVIDE expression|
                expression TIMES expression;


//condition: expression OPERATOR expression;

//expression: OPENPARENTESIS? (PROPERTYID | ID | N) (OPERATOR (PROPERTYID | ID | N)) * CLOSEDPARENTESIS?;

interval: '[' (N|ID) INTERVALSEPARATION (N|ID) '[';

value:ID|N|(r g? b?);

delimiter: '---';

r:COLOR;
g:COLOR;
b:COLOR;

PROPERTYID: [a-z]+;
ID:[A-Z]+;
N: [0-9]+;
COLOR:  '|'? [0-9]+ '|'?;
LINECOLOR: [0-9]+ '|' [0-9]+ '|' [0-9]+;
WS: [ \t\r\n]+ -> skip;
//OPERATOR: '*' | '-' | '+' | '/' | '%';
PLUS:'+';
MINUS:'-';
TIMES:'*';
DIVIDE:'/';
PROPERTYSEPARATOR: '~';
ENDINSTRUCTION: '_';
INTERVALSEPARATION: ',';
EQUALS: '=';
OPENPARENTESIS:'(';
CLOSEDPARENTESIS:')';
