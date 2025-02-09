package com.ko.playground.basic.support;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BaseEntityTest {

    @Test
    void testEquals() {
        BaseEntity baseEntity1 = new BaseEntity();
        baseEntity1.setId(1L);

        BaseEntity baseEntity2 = new BaseEntity();
        baseEntity2.setId(1L);

        BaseEntity baseEntity3 = new BaseEntity();
        baseEntity3.setId(2L);

        assertEquals(baseEntity1, baseEntity2);
        assertNotEquals(baseEntity1, baseEntity3);
    }

    @Test
    void testHashCode() {
        BaseEntity baseEntity1 = new BaseEntity();
        baseEntity1.setId(1L);

        BaseEntity baseEntity2 = new BaseEntity();
        baseEntity2.setId(1L);

        BaseEntity baseEntity3 = new BaseEntity();
        baseEntity3.setId(2L);

        assertEquals(baseEntity1.hashCode(), baseEntity2.hashCode());
        assertNotEquals(baseEntity1.hashCode(), baseEntity3.hashCode());
    }
}