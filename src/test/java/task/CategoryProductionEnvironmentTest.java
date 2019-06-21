package task;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import task.category.ProductionEnvironment;

@RunWith(Categories.class)
@Categories.IncludeCategory(
        ProductionEnvironment.class
)
@Suite.SuiteClasses(
        {
                SendEmailTaskTest.class
        }
)
public class CategoryProductionEnvironmentTest {
}
