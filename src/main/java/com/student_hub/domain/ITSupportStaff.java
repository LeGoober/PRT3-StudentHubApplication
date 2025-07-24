package com.student_hub.domain;

import java.util.Objects;

public class ITSupportStaff {
    private int userID;
    private String staffNumber;

    public ITSupportStaff() {
    }
    private ITSupportStaff(Builder builder) {
        this.userID = builder.userID;
        this.staffNumber = builder.staffNumber;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public int getUserID() {
        return userID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ITSupportStaff that = (ITSupportStaff) o;
        return userID == that.userID && Objects.equals(staffNumber, that.staffNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, staffNumber);
    }

    @Override
    public String toString() {
        return "ITSupportStaff{" +
                "staffNumber='" + staffNumber + '\'' +
                ", userID=" + userID +
                '}';
    }
    public static class Builder {
        private int userID;
        private String staffNumber;

        public Builder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        public Builder setStaffNumber(String staffNumber) {
            this.staffNumber = staffNumber;
            return this;
        }

        public Builder copy() {
            ITSupportStaff itSupportStaff = new ITSupportStaff();
            itSupportStaff.userID = this.userID;
            itSupportStaff.staffNumber = this.staffNumber;
            return this;
        }
        public ITSupportStaff build() {
            return new ITSupportStaff(this);
        }

    }
}
