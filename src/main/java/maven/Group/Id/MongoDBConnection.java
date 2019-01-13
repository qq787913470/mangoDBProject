package maven.Group.Id;

import java.util.List;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

	public static void main(String[] args) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		List<String> dbs = mongo.getDatabaseNames();
		System.out.println(dbs); // [journaldev, local, admin]

	}

}
