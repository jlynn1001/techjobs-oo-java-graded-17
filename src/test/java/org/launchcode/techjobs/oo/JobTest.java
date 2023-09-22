package org.launchcode.techjobs.oo;

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
        Job jobTest3  = new Job("Product tester", new Employer("ACME"));
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
}
