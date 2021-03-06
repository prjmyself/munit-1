/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.munit.config;

import org.junit.Test;

import org.mule.api.MuleContext;

import static org.mockito.Mockito.mock;

/**
 * @author Mulesoft Inc.
 * @since 3.3.2
 */
public class MunitAfterTestTest
{

    MuleContext muleContext = mock(MuleContext.class);

    @Test
    public void testConstructor()
    {
        new MunitAfterTest("name", muleContext);
    }
}
