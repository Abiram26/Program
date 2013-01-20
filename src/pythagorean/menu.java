/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class menu
/*    */ {
/*    */   public void menuMethod()
/*    */   {
/*  7 */     String answ;
				answ = JOptionPane.showInputDialog("What would you like to do ?  \n 1: Pythagorean Theorem  \n 2: Area \n 3: Volume \n 4: Reserved.. \n 5: Reserved.. \n  \n  \n  \n  \n Made By Abiram26 & Jimlarck \n Version: 1.0.0 ");
/*    */ 
/* 21 */     double answer = Double.parseDouble(answ);
/*    */ 
/* 23 */     if (answer == 1){
/* 24 */     pmenu Py = new pmenu();
/* 25 */     Py.pyMenu();}
			 if (answer == 2){
				 prmenu Py = new prmenu();
				 Py.ssMenu();}
			 if (answer == 3){
				 ptmenu Py = new ptmenu();
				 Py.saMenu();
			 }
			 
				else {
					System.exit(0);
				}
/*    */   }
/*    */ }

/* Location:           C:\A\Math App\Geometry Calculator-ALPHA-0.4.4.jar
 * Qualified Name:     pythagorean.menu
 * JD-Core Version:    0.6.2
 */

// Integer.parseInt(answ);