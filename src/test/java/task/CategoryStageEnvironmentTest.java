package task;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import task.category.StageEnvironment;

@RunWith(Categories.class)
@Categories.IncludeCategory(
        StageEnvironment.class
)
@Suite.SuiteClasses(
        {
                SendEmailTaskTest.class
        }
)
public class CategoryStageEnvironmentTest {
}
