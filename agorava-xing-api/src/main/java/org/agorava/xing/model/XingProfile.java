/*
 * Copyright 2013 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.xing.model;

import org.agorava.core.api.UserProfile;

/**
 * Model class containing a user's XING profile information.
 *
 * @author Craig Walls
 * @author Werner Keil
 */
public class XingProfile extends UserProfile {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5895923946997001390L;
	private BirthDate birthDate;
    private PhotoUrls photoUrls;
    private String interests;
    private String wants;
    private String organisationMember;
    private String gender;
    private String pageName;
    private BusinessAddress businessAddress;
    private String haves;
    private final String firstName;
    private final String lastName;
    private final String permalink;
    private final String activeEmail;
    private final String displayName;

    public XingProfile(
            String id,
            String firstName,
            String lastName,
            String permalink,
            String activeEmail,
            String displayName
    ) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.permalink = permalink;
        this.activeEmail = activeEmail;
        this.displayName = displayName;
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhotoUrls(PhotoUrls photoUrls) {
        this.photoUrls = photoUrls;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public void setWants(String wants) {
        this.wants = wants;
    }

    public void setOrganisationMember(String organisationMember) {
        this.organisationMember = organisationMember;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public void setBusinessAddress(BusinessAddress businessAddress) {
        this.businessAddress = businessAddress;
    }

    public void setHaves(String haves) {
        this.haves = haves;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public PhotoUrls getPhotoUrls() {
        return photoUrls;
    }

    public String getInterests() {
        return interests;
    }

    public String getWants() {
        return wants;
    }

    public String getOrganisationMember() {
        return organisationMember;
    }

    public String getGender() {
        return gender;
    }

    public String getPageName() {
        return pageName;
    }

    public BusinessAddress getBusinessAddress() {
        return businessAddress;
    }

    public String getHaves() {
        return haves;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getActiveEmail() {
        return activeEmail;
    }

    public String getDisplayName() {
        return displayName;
    }

	@Override
	public String getFullName() {
		return firstName + " " + lastName;
	}

	@Override
	public String getProfileImageUrl() {
		return getPhotoUrls().getLarge();
	}
}
