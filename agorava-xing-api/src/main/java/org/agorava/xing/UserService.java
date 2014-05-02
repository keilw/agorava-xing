/*
 * Copyright 2014 Agorava
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


package org.agorava.xing;

import org.agorava.xing.model.XingProfile;
import org.agorava.spi.UserProfileService;

import java.util.List;

/**
 * Operations on User API
 *
 * @author Werner Keil
 */
public interface UserService extends UserProfileService {

    /**
     * Retrieves the profile for the authenticated user.
     *
     * @return the user's profile information.
     * @throws ApiException                  if there is an error while communicating with Facebook.
     * @throws MissingAuthorizationException if FacebookTemplate was not created with an access token.
     */
    XingProfile getUserProfile();

    /**
     * Retrieves the profile for the specified user.
     *
     * @param userId the Facebook user ID to retrieve profile data for.
     * @return the user's profile information.
     * @throws ApiException if there is an error while communicating with Facebook.
     */
    XingProfile getUserProfile(String userId);

    /**
     * Retrieves the user's profile image. Returns the image in Facebook's "normal" type.
     *
     * @return an array of bytes containing the user's profile image.
     * @throws ApiException                  if there is an error while communicating with Facebook.
     * @throws MissingAuthorizationException if FacebookTemplate was not created with an access token.
     */
    byte[] getUserProfileImage();

    /**
     * Retrieves the user's profile image. Returns the image in Facebook's "normal" type.
     *
     * @param userId the Facebook user ID.
     * @return an array of bytes containing the user's profile image.
     * @throws ApiException if there is an error while communicating with Facebook.
     */
    byte[] getUserProfileImage(String userId);

    /**
     * Retrieves a list of permissions that the application has been granted for the authenticated user.
     *
     * @return the permissions granted for the user.
     * @throws ApiException                  if there is an error while communicating with Facebook.
     * @throws MissingAuthorizationException if FacebookTemplate was not created with an access token.
     */
    List<String> getUserPermissions();
}