package com.yi.objectfactory.frogfactory;

public class Frog {
            private String frogName;
            private String frogBreed;
            private int frogAge;
            private short frogWeight;

            public Frog(String frogName, String frogBreed, int frogAge, short frogWeight) {
                this.frogName = frogName;
                this.frogBreed = frogBreed;
                this.frogAge = frogAge;
                this.frogWeight = frogWeight;
            }

            public String getFrogName() {
                return frogName;
            }

            public void setFrogName(String frogName) {
                this.frogName = frogName;
            }

            public String getFrogBreed() {
                return frogBreed;
            }

            public void setFrogBreed(String frogBreed) {
                this.frogBreed = frogBreed;
            }

            public int getFrogAge() {
                return frogAge;
            }

            public void setFrogAge(int frogAge) {
                this.frogAge = frogAge;
            }

            public short getFrogWeight() {
                return frogWeight;
            }

            public void setFrogWeight(short frogWeight) {
                this.frogWeight = frogWeight;
            }

            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("Frog{");
                sb.append("frogName='").append(frogName).append('\'');
                sb.append(", frogBreed='").append(frogBreed).append('\'');
                sb.append(", frogAge=").append(frogAge);
                sb.append(", frogWeight=").append(frogWeight);
                sb.append('}');
                return sb.toString();
            }
        }
