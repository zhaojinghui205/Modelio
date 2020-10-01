/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ModelerModule v9.1.00

 * This file was generated on 3/2/20 11:26 AM by Modelio Studio.
 */
package org.modelio.module.modelermodule.api.xmi.standard.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.modelermodule.api.IModelerModulePeerModule;
import org.modelio.module.modelermodule.api.ModelerModuleProxyFactory;
import org.modelio.module.modelermodule.impl.ModelerModuleModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Activity} with << UML2Interaction  >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fe0a2eb7-94ca-4d4c-b8b4-0755c72af361")
public class UML2Interaction {
    @objid ("363156ee-67e8-4bf7-9627-4851371bd6d1")
    public static final String STEREOTYPE_NAME = "UML2Interaction ";

    /**
     * The underlying {@link Activity} represented by this proxy, never null.
     */
    @objid ("fcaed73a-b7d1-470e-a0f1-6303329e160a")
    protected final Activity elt;

    /**
     * Tells whether a {@link UML2Interaction proxy} can be instantiated from a {@link MObject} checking it is a {@link Activity} stereotyped << UML2Interaction  >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("627dc50f-af4d-4048-84a0-dd133326f110")
    public static boolean canInstantiate(MObject elt) {
        return ((elt instanceof Activity) && ((Activity) elt).isStereotyped(IModelerModulePeerModule.MODULE_NAME, UML2Interaction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Activity} stereotyped << UML2Interaction  >> then instantiate a {@link UML2Interaction} proxy.
     * 
     * @return a {@link UML2Interaction} proxy on the created {@link Activity}.
     */
    @objid ("2017b4b1-3cbe-4c51-a3aa-12d8a4c82f1f")
    public static UML2Interaction create() {
        ModelElement e = (ModelElement)ModelerModuleModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Activity");
        e.addStereotype(IModelerModulePeerModule.MODULE_NAME, UML2Interaction.STEREOTYPE_NAME);
        return UML2Interaction.instantiate((Activity)e);
    }

    /**
     * Tries to instantiate a {@link UML2Interaction} proxy from a {@link Activity} stereotyped << UML2Interaction  >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Activity
     * @return a {@link UML2Interaction} proxy or <i>null</i>.
     */
    @objid ("78234a2c-4a48-4b90-8ab6-3ce0776773de")
    public static UML2Interaction instantiate(Activity obj) {
        return UML2Interaction.canInstantiate(obj) ? new UML2Interaction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UML2Interaction} proxy from a {@link Activity} stereotyped << UML2Interaction  >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Activity}
     * @return a {@link UML2Interaction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f47a5865-bdc5-4bee-9788-c6ae3c0d9905")
    public static UML2Interaction safeInstantiate(Activity obj) throws IllegalArgumentException {
        if (UML2Interaction.canInstantiate(obj))
        	return new UML2Interaction(obj);
        else
        	throw new IllegalArgumentException("UML2Interaction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("69dc1408-7aab-4998-b198-508894133a14")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UML2Interaction other = (UML2Interaction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Activity}. 
     * @return the Activity represented by this proxy, never null.
     */
    @objid ("304e4928-d96b-47c7-b508-65791d7c625c")
    public Activity getElement() {
        return this.elt;
    }

    @objid ("ab90d548-efb3-4674-8f9d-a5cc9bcf25d1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ea0c64b1-433a-4b42-bf9f-85ab8aa4057d")
    protected UML2Interaction(Activity elt) {
        this.elt = elt;
    }

    @objid ("2d8755d9-18eb-44df-b006-43b75366bab0")
    public static final class MdaTypes {
        @objid ("a5082e0b-f107-469e-9389-9fd8b13e97c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("92e9718f-11d5-4b12-be64-0c3ebd54771b")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ab5f50a-67f7-4400-8313-98d8794ea4dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e1c55fb0-9555-4354-b88e-2232e0d8350e")
        public static void init(IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "021863a9-f3db-11df-8ada-0027103f347c");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(ModelerModuleModule.getInstance() != null) {
			init(ModelerModuleModule.getInstance().getModuleContext());
		}
	}
    }

}
