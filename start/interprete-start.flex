     
%%
   
%package hassen.logo.interpreter
%class Lexer
%public
%line
%column
%cup

%%

[ \t\n\r]		{ }
^#.*			{ }

";"							{ return getSymbolFactory().newSymbol ("TERM", Sym.TERM); }
","							{ return getSymbolFactory().newSymbol ("COMA", Sym.COMA); }
"="							{ return getSymbolFactory().newSymbol ("EQUAL", Sym.EQUAL); }
"+"							{ return getSymbolFactory().newSymbol ("ADD", Sym.ADD); }
"-"							{ return getSymbolFactory().newSymbol ("SUB", Sym.SUB); }
"/"							{ return getSymbolFactory().newSymbol ("DIV", Sym.DIV); }
"*"							{ return getSymbolFactory().newSymbol ("MULT", Sym.MULT); }

"move"						{ return getSymbolFactory().newSymbol ("MOVE", Sym.MOVE); }
"turn"						{ return getSymbolFactory().newSymbol ("TURN", Sym.TURN); }
"on"							{ return getSymbolFactory().newSymbol ("ON", Sym.ON); }
"off"						{ return getSymbolFactory().newSymbol ("OFF", Sym.OFF); }
"home"						{ return getSymbolFactory().newSymbol ("HOME", Sym.HOME); }
"goto"						{ return getSymbolFactory().newSymbol ("GOTO", Sym.GOTO); }


"avance"						{ return getSymbolFactory().newSymbol ("MOVE", Sym.MOVE); }
"tourne"						{ return getSymbolFactory().newSymbol ("TURN", Sym.TURN); }
"haut"						{ return getSymbolFactory().newSymbol ("ON", Sym.ON); }
"bas"						{ return getSymbolFactory().newSymbol ("OFF", Sym.OFF); }

[0-9]+						{ return getSymbolFactory().newSymbol ("INTEGER", Sym.INTEGER, Integer.parseInt(yytext())); }
[a-zA-Z][a-zA-Z0-9]*			{ return getSymbolFactory().newSymbol ("VARIABLE", Sym.VARIABLE, yytext()); }


[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
