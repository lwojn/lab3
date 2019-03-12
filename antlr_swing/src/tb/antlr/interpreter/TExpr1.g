tree grammar TExpr1;

options {
	tokenVocab=Expr;

	ASTLabelType=CommonTree;
    superClass=MyTreeParser;
}

@header {
package tb.antlr.interpreter;
import java.util.HashMap;
}

@members {
  HashMap<String, Integer> vars = new HashMap<>();
}

prog    : (e=expr {drukuj ($e.text + " = " + $e.out.toString());})* ;

expr returns [Integer out]
	      : ^(PLUS  e1=expr e2=expr) {$out = $e1.out + $e2.out;}
        | ^(MINUS e1=expr e2=expr) {$out = $e1.out - $e2.out;}
        | ^(MUL   e1=expr e2=expr) {$out = $e1.out * $e2.out;}
        | ^(DIV   e1=expr e2=expr) {$out = $e1.out / $e2.out;}
        | ^(PODST i1=ID   e2=expr) {vars.put($i1.text, $e2.out);}
        | INT                      {$out = getInt($INT.text);}
        | ID                       {}
        | ^(VAR i1=ID)             {}
        ;

        