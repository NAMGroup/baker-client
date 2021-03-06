/**
 * Copyright 2014 University of Patras 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License.
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and limitations under the License.
 */

package gr.upatras.ece.nam.baker.client.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Entity(name = "DeployContainer")
public class DeployContainer extends Container{

	
	@Basic
	private DeploymentDescriptorStatus masterDeploymentStatus;
	
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn() })
	private SubscribedResource targetResource;

	public SubscribedResource getTargetResource() {
		return targetResource;
	}

	public void setTargetResource(SubscribedResource targetResource) {
		this.targetResource = targetResource;
	}

	public DeploymentDescriptorStatus getMasterDeploymentStatus() {
		return masterDeploymentStatus;
	}

	public void setMasterDeploymentStatus(DeploymentDescriptorStatus masterDeploymentStatus) {
		this.masterDeploymentStatus = masterDeploymentStatus;
	}

}
