grammar DrawScript;

program: header* delimiter  parameter* delimiter;

parameter: parid = PARAMETERID ':' parvalue= parametervalue;

header: id=ID ':' val=value;

parametervalue: ID |(ID|N) (OPERATOR (ID|N))* PARAMETERSEPARATOR (ID|N) (OPERATOR (ID|N))*;

value:N|r g? b?;
delimiter: '---';

r: COLOR;
g:COLOR;
b:COLOR;

PARAMETERID: [a-z]+;
ID:[A-Z]+;
N: [0-9]+;
COLOR:  '|' [0-9]+ '|';
WS: [ \t\r\n]+ -> skip;
OPERATOR: '*' | '-' | '+' | '/';
PARAMETERSEPARATOR: '~';