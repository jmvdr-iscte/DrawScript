grammar DrawScript;

program: constant* delimiter property* delimiter instruction*;

property: propid = PROPERTYID ':' propvalue= propertyvalue;

instruction : declaration| forLoop | ifStatement | elseStatement | geometricobjectsdec| ENDINSTRUCTION;

ifStatement: 'if' condition EQUALSOPERATOR conditionResult = (N | ID | PROPERTYID);

elseStatement: 'else';

declaration : id=PROPERTYID  declarationvall= declarationvalue;

geometricobjectsdec: id = PROPERTYID geometricobjects;

declarationvalue: decvalue;

constant: id=ID ':' val=value;

propertyvalue: ID |(ID|N) (OPERATOR (ID|N))* PROPERTYSEPARATOR (ID|N) (OPERATOR (ID|N))*;

geometricobjects: xexpression INTERVALSEPARATION yexpression;

xexpression:(ID|PROPERTYID|N) ((OPERATOR|PROPERTYSEPARATOR)? (ID|N|PROPERTYID))*;

yexpression: (ID|PROPERTYID|N) ((OPERATOR|PROPERTYSEPARATOR)? (ID|N|PROPERTYID))*;

forLoop: 'for' PROPERTYID 'in' interval;

decvalue:N|ID|linevalue;

linevalue : LINECOLOR;


condition: expression OPERATOR expression;

expression: OPENPARENTESIS? (PROPERTYID | ID | N) (OPERATOR (PROPERTYID | ID | N)) * CLOSEDPARENTESIS?;

interval: '[' (N|ID) INTERVALSEPARATION (N|ID) '[';

value:N|r g? b?;

delimiter: '---';

r:COLOR;
g:COLOR;
b:COLOR;

PROPERTYID: [a-z]+;
ID:[A-Z]+;
N: [0-9]+;
COLOR:  '|' [0-9]+ '|';
LINECOLOR: [0-9]+ '|' [0-9]+ '|' [0-9]+;
WS: [ \t\r\n]+ -> skip;
OPERATOR: '*' | '-' | '+' | '/' | '%';
PROPERTYSEPARATOR: '~';
ENDINSTRUCTION: '_';
INTERVALSEPARATION: ',';
EQUALSOPERATOR: '=';
OPENPARENTESIS:'(';
CLOSEDPARENTESIS:')';
