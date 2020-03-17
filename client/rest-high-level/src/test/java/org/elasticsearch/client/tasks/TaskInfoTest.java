package org.elasticsearch.client.tasks;

import org.elasticsearch.test.ESTestCase;


public class TaskInfoTest extends ESTestCase {


    public void testToString() {

        TaskInfo taskInfo1 = new TaskInfo(new TaskId("001"));
        taskInfo1.setType("type");
        taskInfo1.setAction("action");
        taskInfo1.setDescription("description");


        String expected = "TaskInfo{" +
            "taskId=001, type='type', action='action, description='description', startTime=, runningTimeNanos=, cancellable=, parentTaskId=, status=, headers=}";
        assertEquals(expected,taskInfo1.toString());

    }

    public void testEquals() {
        TaskInfo taskInfo1 = new TaskInfo(new TaskId("001"));
        taskInfo1.setType("type");
        taskInfo1.setAction("action");
        taskInfo1.setDescription("description");

        TaskInfo taskInfo2 = new TaskInfo(new TaskId("001"));
        taskInfo2.setType("type");
        taskInfo2.setAction("action");
        taskInfo2.setDescription("description");

        TaskInfo taskInfo3 = new TaskInfo(new TaskId("003"));
        taskInfo3.setType("type");
        taskInfo3.setAction("action");
        taskInfo3.setDescription("description");

        TaskInfo taskInfo4 = new TaskInfo(new TaskId("001"));
        taskInfo4.setType("type");
        taskInfo4.setAction("action");
        taskInfo4.setDescription("description4");

        assertEquals(taskInfo1,taskInfo1);

        assertEquals(taskInfo1,taskInfo2);

        assertNotEquals(taskInfo1,taskInfo3);

        assertNotEquals(taskInfo1,taskInfo4);


    }

    public void testHashCode() {
        TaskInfo taskInfo1 = new TaskInfo(new TaskId("001"));
        taskInfo1.setType("type");
        taskInfo1.setAction("action");
        taskInfo1.setDescription("description");

        TaskInfo taskInfo2 = new TaskInfo(new TaskId("001"));
        taskInfo2.setType("type");
        taskInfo2.setAction("action");
        taskInfo2.setDescription("description");

        TaskInfo taskInfo3 = new TaskInfo(new TaskId("003"));
        taskInfo3.setType("type");
        taskInfo3.setAction("action");
        taskInfo3.setDescription("description");

        TaskInfo taskInfo4 = new TaskInfo(new TaskId("001"));
        taskInfo4.setType("type");
        taskInfo4.setAction("action");
        taskInfo4.setDescription("description4");

        assertEquals(taskInfo1.hashCode(),taskInfo1.hashCode());

        assertEquals(taskInfo1.hashCode(),taskInfo2.hashCode());

        assertNotEquals(taskInfo1.hashCode(),taskInfo3.hashCode());

        assertNotEquals(taskInfo1.hashCode(),taskInfo4.hashCode());
    }

}
