package co.eju.dbprj;

import co.eju.dbprj.db.DevServiceImple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   //     System.out.println( "Hello World!" );
    	
   // 	DataSource dao = new DataSource();
    	
    	DevServiceImple dao = new DevServiceImple();
    	dao.selectList();
    }
}
