/* Generated By:JJTree: Do not edit this line. ASTJspDocument.java */

package net.sourceforge.pmd.jsp.ast;

public class ASTJspDocument extends SimpleNode {
  public ASTJspDocument(int id) {
    super(id);
  }

  public ASTJspDocument(JspParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JspParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
