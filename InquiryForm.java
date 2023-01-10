/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inquiryform;

/**
 *
 * @author Sarthak
 */
public class InquiryForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //Visitor visitor = new Visitor("java","Ritik","IPS","B.tech","CSE","3rd","99999","4644","Ritik@","xyz","Indore","MP","452001","4 month","5 to 7","Xyz","Ritik");
 
 NewVisitor newVisitor = new NewVisitor("15/06/2021", "25/09/2021", "Fully Vaccinated", "96","java","Ritik","IPS","B.tech","CSE","3rd","99999","4644","Ritik@","xyz","Indore","MP","452001","4 month","5 to 7","Xyz","Ritik" );
 
 Operation.printVisitorDetails(newVisitor);
 
 
 //Operation.printVisitorDetails(visitor);
    }
    
}
