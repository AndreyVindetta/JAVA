public enum vremena_goda {
    SUMMER(22) {
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(8),
    WINTER(-7),
    SPRING(10);
    public int temp;
    vremena_goda(int temp)
    {
        this.temp = temp;
    }
    public int getTemp(int temp)
    {
        return temp;
    }
    public String getDescription()
    {
        return "Холодное время года";
    }
}