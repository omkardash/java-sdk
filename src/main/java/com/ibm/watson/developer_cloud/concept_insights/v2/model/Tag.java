/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.watson.developer_cloud.concept_insights.v2.model;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * Tag.
 */
public class Tag extends GenericModel {
  private String concept;
  private Integer count;

  /**
   * Gets the concept.
   * 
   * @return The concept
   */
  public String getConcept() {
    return concept;
  }

  /**
   * Gets the count.
   * 
   * @return The count
   */
  public Integer getCount() {
    return count;
  }

  /**
   * Sets the concept.
   * 
   * @param concept The concept
   */
  public void setConcept(String concept) {
    this.concept = concept;
  }

  /**
   * Sets the count.
   * 
   * @param count The count
   */
  public void setCount(Integer count) {
    this.count = count;
  }
}
