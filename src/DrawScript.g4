grammar DrawScript;

program: header* delimiter parameter* delimiter instruction*;

parameter: parid = PARAMETERID ':' parvalue= parametervalue;

instruction : declaration| forLoop | ifStatement | elseStatement | geometricobjectsdec| ENDINSTRUCTION;

ifStatement: 'if' condition EQUALSOPERATOR conditionResult = (N | ID | PARAMETERID);

elseStatement: 'else';

declaration : id=PARAMETERID  declarationvall;
geometricobjectsdec: id = PARAMETERID geometricobjects;

declarationvall: decvalue;

header: id=ID ':' val=value;

parametervalue: ID |(ID|N) (OPERATOR (ID|N))* PARAMETERSEPARATOR (ID|N) (OPERATOR (ID|N))*;

geometricobjects: xexpression INTERVALSEPARATION yexpression;

xexpression:(ID|PARAMETERID|N) ((OPERATOR|PARAMETERSEPARATOR)? (ID|N|PARAMETERID))*;

yexpression: (ID|PARAMETERID|N) ((OPERATOR|PARAMETERSEPARATOR)? (ID|N|PARAMETERID))*;

forLoop: 'for' PARAMETERID 'in' interval;

decvalue:N|ID|r g? b?;

condition: expression OPERATOR expression;

expression: OPENPARENTESIS? (PARAMETERID | ID | N) (OPERATOR (PARAMETERID | ID | N)) * CLOSEDPARENTESIS?;

interval: '[' (N|ID) INTERVALSEPARATION (N|ID) '[';

value:N|r g? b?;

delimiter: '---';

r:COLOR;
g:COLOR;
b:COLOR;

PARAMETERID: [a-z]+;
ID:[A-Z]+;
N: [0-9]+;
COLOR:  '|' [0-9]+ '|';
WS: [ \t\r\n]+ -> skip;
OPERATOR: '*' | '-' | '+' | '/' | '%';
PARAMETERSEPARATOR: '~';
ENDINSTRUCTION: '_';
INTERVALSEPARATION: ',';
EQUALSOPERATOR: '=';
OPENPARENTESIS:'(';
CLOSEDPARENTESIS:')';
