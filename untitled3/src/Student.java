class Student {
            private String firstName;
            private String lastName;

            // Constructor
            public Student(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            // Getters
            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            // Setters
            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            // Override toString method to print student's full name
            @Override
            public String toString() {
                return firstName + " " + lastName;
            }
        }
