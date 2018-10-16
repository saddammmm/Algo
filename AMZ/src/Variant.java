/*    */
/*    */ 
/*    */ public class Variant {
/*    */   private String field;
/*    */   
/*  6 */   public String getField() { return field; }
/*    */   
/*    */   public void setField(String field)
/*    */   {
/* 10 */     this.field = field;
/*    */   }
/*    */   
/*    */   public Variant(int j)
/*    */   {
/* 15 */     field = ("" + j);
/*    */   }
/*    */   
/*    */   public Variant(String field)
/*    */   {
/* 20 */     this.field = field;
/*    */   }
/*    */   
/*    */ 
/*    */   public Variant() {}
/*    */   
/*    */ 
/*    */   public String toString()
/*    */   {
/* 29 */     return getField();
/*    */   }
/*    */   
/*    */   public String getString() {
/* 33 */     return field;
/*    */   }
/*    */ }

/* Location:           D:\Perforce\gatherer\dap\agents\main\lib\gatherer.jar
 * Qualified Name:     yodlee.mshtml.Variant
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */