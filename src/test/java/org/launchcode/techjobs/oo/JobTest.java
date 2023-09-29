package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job("Dif job", new Employer("Same name"), new Location("Same location"), new PositionType("Same position type"), new CoreCompetency("Same core competency"));
        Job testJob2 = new Job("Dif job", new Employer("Same name"), new Location("Same location"), new PositionType("Same position type"), new CoreCompetency("Same core competency"));
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobTest3  = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobTest3 instanceof Job);
        assertTrue(jobTest3.getEmployer() instanceof Employer);
        assertTrue(jobTest3.getLocation() instanceof Location);
        assertTrue(jobTest3.getPositionType() instanceof PositionType);
        assertTrue(jobTest3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(jobTest3.getName(), "Product tester");
        assertEquals(jobTest3.getEmployer().getValue(), "ACME");
        assertEquals(jobTest3.getLocation().getValue(), "Desert");
        assertEquals(jobTest3.getPositionType().getValue(), "Quality control");
        assertEquals(jobTest3.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality(){
        Job testJob4 = new Job("Dif job", new Employer("Same name"), new Location("Same location"), new PositionType("Same position type"), new CoreCompetency("Same core competency"));
        Job testJob5 = new Job("Dif job", new Employer("Same name"), new Location("Same location"), new PositionType("Same position type"), new CoreCompetency("Same core competency"));
       assertNotEquals(testJob4, testJob5);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob6 = new Job("Test job", new Employer("Test employer"), new Location("Test location"), new PositionType("Test position type"), new CoreCompetency("Test core competency"));
       String jobString = testJob6.toString();
       String emptyLine = "\n";
        assertTrue(jobString.startsWith(emptyLine));
        assertTrue(jobString.endsWith(emptyLine));

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob7 = new Job("Test job", new Employer("Test employer"), new Location("Test location"), new PositionType("Test position type"), new CoreCompetency("Test core competency"));
        String jobString = testJob7.toString();
        String emptyLine = "\n";
        System.out.println(jobString);
        assertTrue(jobString.contains("Name: Test job" + emptyLine));
        assertTrue(jobString.contains("Employer: Test employer" + emptyLine));
        assertTrue(jobString.contains("Location: Test location" + emptyLine));
        assertTrue(jobString.contains("Position Type: Test position type" + emptyLine));
        assertTrue(jobString.contains("Core Competency: Test core competency" + emptyLine));
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob8 = new Job("Test job", new Employer(), new Location("Test location"), new PositionType("Test position type"), new CoreCompetency("Test core competency"));
        String jobString = testJob8.toString();
        System.out.println(jobString);
        assertTrue(jobString.contains("Employer: Data not available"));
    }
}
