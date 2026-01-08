package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void canCreateGroup() {
        app.groups.openGroupsPage(app);
        app.createGroup(new GroupData("group name", "group header", "group footer"));
    }


    @Test
    public void canCreateGroupWithEmptyName() {
        app.groups.openGroupsPage(app);
        app.createGroup(new GroupData());
    }
    @Test
    public void canCreateGroupWithNameOnly() {
        app.groups.openGroupsPage(app);
        app.createGroup(new GroupData().withName("some name"));
    }
}
