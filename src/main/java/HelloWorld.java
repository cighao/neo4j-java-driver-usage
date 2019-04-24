import org.neo4j.driver.v1.*;

//import org.neo4j.driver.v1.Values.parameters;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
//        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "123456"));
//        try (Session session = driver.session()) {
//            StatementResult rs = session.run("CREATE (n) RETURN n");
//        }
//        driver.close();

        Driver driver = GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "123456" ) );
        Session session = driver.session();

        //session.run( "CREATE (a:Person {name: {name}, title: {title}})", parameters( "name", "Arthur", "title", "King" ) );
        //session.run("CREATE (n) RETURN n");
        session.run("CREATE (m)-[:r2]->(c)");
//        session.run("CREATE (m)-[:r2]->(c)");
//        session.run("CREATE (m)-[:r2]->(c)");
//        session.run("CREATE (m)-[:r2]->(c)");
//        session.run("CREATE (m)-[:r2]->(c)");
//        session.run("CREATE (m)-[:r2]->(c)");
    }
}
