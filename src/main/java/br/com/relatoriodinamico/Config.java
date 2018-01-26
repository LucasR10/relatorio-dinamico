package br.com.relatoriodinamico;
import static net.sf.dynamicreports.report.builder.DynamicReports.*;

public class Config {
	
	   
	    private void build() {
	      try {
	        report()//create new report design
	          .columns() //adds columns
	          .groupBy() //adds groups
	          .subtotalsAtSummary() //adds subtotals
	          //set datasource
	          .setDataSource()
	          //export report
	          .toPdf(true) //export report to pdf
	          .toJasperPrint() //creates jasperprint object
	          .show() //shows report
	          .print(); //prints report
	       
	      } catch (DRException e) {
	        e.printStackTrace(); 
	      }
	    } 
	  }


}
