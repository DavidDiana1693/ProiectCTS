package Testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ test01.class, test02.class, test03.class, test04.class,
		test05.class })
public class AllTests {

}
