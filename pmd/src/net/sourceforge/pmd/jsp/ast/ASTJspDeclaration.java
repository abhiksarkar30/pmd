/* Generated By:JJTree: Do not edit this line. ASTJspDeclaration.java */

package net.sourceforge.pmd.jsp.ast;

public class ASTJspDeclaration extends SimpleNode {
  public ASTJspDeclaration(int id) {
    super(id);
  }

  public ASTJspDeclaration(JspParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JspParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
