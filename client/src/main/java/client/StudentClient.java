package client;

import base.Chicken;
import dbimpl.StudentDbService;
import model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.StudentService;


public class StudentClient {

    private static final Logger logger = LogManager.getLogger();

    public StudentClient() {
        logger.info("Client Start!!");
    }

    public static void main(String[] args) {
        StudentService service = new StudentDbService();
        service.create(new Student());
        service.read("17SS0001");
        service.update(new Student());
        service.delete("17SS0001");

        Chicken chicken = new Chicken();
        chicken.getName();
    }
}
