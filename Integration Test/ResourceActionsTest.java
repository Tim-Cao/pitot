package com.liferay.resource.actions.test;

import com.liferay.portal.kernel.security.permission.ResourceActions;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;	import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import org.junit.ClassRule;
import org.junit.Rule;	import org.junit.Rule;
import org.junit.Test;	import org.junit.Test;


@RunWith(Arquillian.class)
public class ResourceActionsTest {	
  @ClassRule
  @Rule
  public static final AggregateTestRule aggregateTestRule =
    new LiferayIntegrationTestRule();
    
    
    
  @Inject
  private ResourceActions _resourceActions;
