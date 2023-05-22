grammar DrawScript;

program: header* delimiter;

parameter:lowid=PARAMETERID ':' exp1 = value PARAMETERSEPARATOR exp2 = value;

header: id=ID ':' val=value;

value:N|r g? b?;
delimiter: '---';

r: COLOR;
g:COLOR;
b:COLOR;

PARAMETERID: [a-z];
ID:[A-Z]+;
N: [0-9]+;
COLOR:  '|' [0-9]+ '|';
WS: [ \t\r\n]+ -> skip;
OPERATOR: '*' | '-' | '+' | '/';
PARAMETERSEPARATOR: '~';