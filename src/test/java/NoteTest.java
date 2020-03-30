import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.logging.Logger;

public class NoteTest {

    public Note note;
    static Logger log = Logger.getLogger(NoteTest.class.getName());

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        log.info("Before all");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        log.info("AfterAll");
    }

    @BeforeEach
    void setUp() throws Exception {
        log.info("BeforeEach");
        note = new Note();
    }

    @AfterEach
    void tearDown() throws Exception {
        log.info("AfterEach");
        note = null;
    }
}
