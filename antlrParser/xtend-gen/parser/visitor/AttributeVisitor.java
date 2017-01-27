package parser.visitor;

import implementation.VariableDeclaration;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.XtdAQLBaseVisitor;
import parser.XtdAQLParser;
import parser.visitor.ModelBuilder;

@SuppressWarnings("all")
public class AttributeVisitor extends XtdAQLBaseVisitor<VariableDeclaration> {
  @Override
  public VariableDeclaration visitRAttribute(final XtdAQLParser.RAttributeContext ctx) {
    TerminalNode _Ident = ctx.Ident();
    String _text = _Ident.getText();
    XtdAQLParser.ExpressionContext _expression = ctx.expression();
    String _text_1 = _expression.getText();
    return ModelBuilder.singleton.buildVariableDecl(_text, _text_1);
  }
}