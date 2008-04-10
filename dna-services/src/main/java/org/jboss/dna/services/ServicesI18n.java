/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.dna.services;

import org.jboss.dna.common.i18n.I18n;

/**
 * @author Randall Hauch
 */
public final class ServicesI18n {

    static {
        try {
            I18n.initialize(ServicesI18n.class);
        } catch (final Exception err) {
            System.err.println(err);
        }
    }

    public static I18n invalidStateString;
    public static I18n serviceShutdowAndMayNotBeStarted;
    public static I18n serviceShutdowAndMayNotBePaused;
    public static I18n unableToFindRepositoryInJndi;
    public static I18n errorProcessingEvents;
    public static I18n errorFindingPropertyNameInPropertyAddedEvent;
    public static I18n errorFindingPropertyNameInPropertyChangedEvent;
    public static I18n errorFindingPropertyNameInPropertyRemovedEvent;

    public static I18n unableToObtainJsr94RuleAdministrator;
    public static I18n errorUsingJsr94RuleAdministrator;
    public static I18n unableToObtainJsr94ServiceProvider;
    public static I18n errorAddingOrUpdatingRuleSet;
    public static I18n errorRollingBackRuleSetAfterUpdateFailed;
    public static I18n errorReadingRulesAndProperties;
    public static I18n errorDeregisteringRuleSetBeforeUpdatingIt;
    public static I18n errorRecreatingRuleSet;
    public static I18n errorRemovingRuleSet;
    public static I18n errorRemovingRuleSetUponShutdown;
    public static I18n unableToFindRuleSet;
    public static I18n errorExecutingRuleSetWithGlobalsAndFacts;
    public static I18n unableToBuildRuleSetRegularExpressionPattern;

    public static I18n errorObtainingSessionToRepositoryWorkspace;
    public static I18n errorWritingProblemsOnRuleSet;

    public static I18n sequencingServiceName;
    public static I18n unableToChangeExecutionContextWhileRunning;
    public static I18n unableToStartSequencingServiceWithoutExecutionContext;
    public static I18n errorWhileSequencingNode;
    public static I18n errorFindingSequencersToRunAgainstNode;
    public static I18n executionContextHasBeenClosed;
    public static I18n sequencerTask;
    public static I18n sequencerSubtask;

    public static I18n errorReadingPropertiesFromContainerNode;
    public static I18n requiredPropertyOnNodeWasExpectedToBeStringValue;
    public static I18n optionalPropertyOnNodeWasExpectedToBeStringValue;
    public static I18n requiredPropertyOnNodeWasExpectedToBeStringArrayValue;
    public static I18n optionalPropertyOnNodeWasExpectedToBeStringArrayValue;
    public static I18n requiredPropertyOnNodeCouldNotBeRead;
    public static I18n optionalPropertyOnNodeCouldNotBeRead;
    public static I18n requiredPropertyIsMissingFromNode;
    public static I18n errorGettingRequiredPropertyFromNode;
    public static I18n errorGettingOptionalPropertyFromNode;
    public static I18n errorClosingBinaryStreamForPropertyFromNode;
    public static I18n requiredNodeDoesNotExistRelativeToNode;
    public static I18n errorGettingNodeRelativeToNode;

    public static I18n pathExpressionIsInvalid;
    public static I18n pathExpressionMayNotBeBlank;
    public static I18n pathExpressionHasInvalidSelect;
    public static I18n pathExpressionHasInvalidMatch;

}
