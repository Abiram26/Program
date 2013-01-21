/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class lmenu // this is the menu for Lateral Surface
/*    */ {
/*    */   public void latsurMenu()
/*    */   {
/*  7 */     String answ = JOptionPane.showInputDialog("What would you like to do ?  \n 1: Calculate Lateral Area Rectangular Prism \n 2: Calculate Lateral Area Pyramid  \n Made By Abiram26 & Jimlarck \n Version: 1.0.0 ");
/*    */ 
/* 21 */     int answer = Integer.parseInt(answ);
/*    */     
/* 26 */     if (answer == 1) { // goes to the lateral surface rectangular square (working!)
/* 27 */     latsurCalc uTheo = new latsurCalc();
/* 28 */     uTheo.calcPrism(); } 
			 if (answer == 2) { latsurCalc uTheo = new latsurCalc(); //goes to the lateral surface
			   uTheo.calcPyramid(); }                                //Pyramid (working!)
			
		     
			
			
/*    */   }
/*    */ }

/* Location:           C:\A\Math App\Geometry Calculator-ALPHA-0.4.4.jar
 * Qualified Name:     pythagorean.pmenu
 * JD-Core Version:    0.6.2
 */