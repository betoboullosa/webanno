/*
 * Copyright 2012
 * Ubiquitous Knowledge Processing (UKP) Lab and FG Language Technology
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tudarmstadt.ukp.clarin.webanno.export.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import de.tudarmstadt.ukp.clarin.webanno.model.AnnotationDocumentState;

/**
 * Annotation document information to be exported/imported
 *
 */
@JsonPropertyOrder(value = { "name", "user", "state", "timestamp" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnotationDocument
{
    @JsonProperty("name")
    String name;
    
    @JsonProperty("user")
    String user;
    
    @JsonProperty("state")
    AnnotationDocumentState state;
    
    @JsonProperty("timestamp")
    private Date timestamp;

    @JsonProperty("sentence_accessed")
    private int sentenceAccessed = 0;

    @JsonProperty("created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @JsonProperty("updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public AnnotationDocumentState getState()
    {
        return state;
    }

    public void setState(AnnotationDocumentState state)
    {
        this.state = state;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(Date timestamp)
    {
        this.timestamp = timestamp;
    }

    public int getSentenceAccessed()
    {
        return sentenceAccessed;
    }

    public void setSentenceAccessed(int sentenceAccessed)
    {
        this.sentenceAccessed = sentenceAccessed;
    }

    public Date getCreated()
    {
        return created;
    }

    public void setCreated(Date aCreated)
    {
        created = aCreated;
    }

    public Date getUpdated()
    {
        return updated;
    }

    public void setUpdated(Date aUpdated)
    {
        updated = aUpdated;
    }
}
