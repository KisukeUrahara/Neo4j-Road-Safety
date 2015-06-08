package testprog;
import java.util.Iterator;
import org.springframework.data.neo4j.template.Neo4jOperations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.neo4j.conversion.Result;
import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.traversal.*;
import org.neo4j.graphdb.Path;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import com.tp.springdata.neo4j.service.*;
import com.tp.springdata.neo4j.domain.*;
import java.util.Scanner;
public class GoogleProfileTest {
   public static void main(String[] args) {
     // ApplicationContext context = new ClassPathXmlApplicationContext("googleprofile.xml");		
      //ManufacturerService manu = (ManufacturerService) context.getBean("ManufacturerService");
      //Neo4jOperations template = null;
     
     GraphDatabaseService graphdb = new GraphDatabaseFactory().newEmbeddedDatabase("C:\\Users\\Mandanna\\Documents\\Neo4j\\default.graphdb");
     ExecutionEngine execEngine = new ExecutionEngine(graphdb);
     /* 1.the most accident prone age group
      MATCH (a:AgeBand)<-[:DRIVER_AGE]-(v:Vehicle)
WITH a, count(v) as incidents
RETURN a.name, incidents
ORDER BY incidents DESC;

2. most accident prone vehicle make
  MATCH (mf:Manufacturer)<-[:MADE_BY]-(v:Vehicle) WITH mf, count(v) as incidents RETURN mf.name, incidents ORDER BY incidents DESC;
    
    
    *3. Most accident prone  propulsion type
    *MATCH (p:Propulsion)<-[:PROPULSION]-(v:Vehicle) WITH p, count(v) as incidents RETURN p.name, incidents ORDER BY incidents DESC;
    *
    *4. Visualizing an entire accident 
    *Match (i:Incident)-[r*1..2]->(n) WHERE i.ref="201101BS70014" return i,n;
    *
    */
     String commands[]= new String[5];
     commands[0]="MATCH (a:AgeBand)<-[:DRIVER_AGE]-(v:Vehicle) WITH a, count(v) as incidents RETURN a.name, incidents ORDER BY incidents DESC;";
     commands[1]="MATCH (mf:Manufacturer)<-[:MADE_BY]-(v:Vehicle) WITH mf, count(v) as incidents RETURN mf.name, incidents ORDER BY incidents DESC;";
     commands[2]="match (m:Manufacturer)<-[br]-(v:Vehicle)-[bv]->(i:Incident) - [r*1..2]->(n) where m.name=\"AUDI\" return i,n;";
     commands[3]="MATCH (p:Propulsion)<-[:PROPULSION]-(v:Vehicle) WITH p, count(v) as incidents RETURN p.name, incidents ORDER BY incidents DESC;"; 
     commands[4]="Match (i:Incident)-[r*1..2]->(n) WHERE i.ref=\"201101BS70014\" return i,n;";
     ExecutionResult result;
     for(int i=0;i<4;i++)
    	 {
    	 	result= execEngine.execute( commands[i] );
    	 	String results = result.dumpToString();
    	      System.out.println(results);
    	 }
      // ExecutionResult result = execEngine.execute( "MATCH (a)-[:`MAKES`]->(b) RETURN a,b LIMIT 25" );
      // String results = result.dumpToString();
      //System.out.println(results);
     
      
    // TraversalDescription td=graphdb.traversalDescription().depthFirst().evaluator( Evaluators.toDepth(3 ) );
     //System.out.println(td.toString());
     /* Manufacturer m1;
       m1=manu.findByName("TOYOTA");
      td.traverse(m1);
      System.out.println("Hi asgvre");

    // TraversalDescription td = graphdb.description().breadthFirst().relationships();
      //for ( Path position : graphdb.traversalDescription().depthFirst())
    	{
    	//    output += position + "\n";
    	}
            
    
       Rating rating = template.createRelationshipBetween(profile1,profile2, Rating.class, "buddies", false).rate(4);
      template.save(rating);
  
    
      // FIND ONE 
      
     // GoogleProfile profile = getOneProfileById(service,67515L);		
      //System.out.println(profile);
      GoogleProfile profile = getOneProfileByName(service,"uthej");		
      System.out.println(profile+"address is "+profile.getAddress()+" gpa is "+profile.getDob());
      

      // FIND ALL
      /*
      getAllProfiles(service);		
      */

      // DELETE 
      /*
      GoogleProfile profile = createPofile();
      deleteProfile(service,profile);		
      System.out.println("GoogleProfile deleted successfully.");		
      
   }
   
   private static GoogleProfile createProfile(GoogleProfileService service, GoogleProfile profile){
      return service.create(profile);
      
   }	
   
   private static void deleteProfile(GoogleProfileService service,GoogleProfile profile){
      service.delete(profile);
   }	
   private static GoogleProfile getOneProfileByName(GoogleProfileService service,String name){
	      return service.findByName(name);
	   }
   private static GoogleProfile getOneProfileById(GoogleProfileService service,Long id){
      return service.findById(id);
   }	
   
   private static void getAllProfiles(GoogleProfileService service){
      Result<GoogleProfile> result = service.findAll();			
      Iterator<GoogleProfile> iterator = result.iterator();
      
      while(iterator.hasNext()){
         System.out.println(iterator.next());
      }
   }
   
       
   */
   }
}
