package com.test.ai.model;

public class HealthModel {
    private String status;

    /**
     * Retrieves the current health status.
     *
     * @return the current status as a String
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status to the provided value.
     *
     * @param status the new status value
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
