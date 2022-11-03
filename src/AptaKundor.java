public enum AptaKundor{
   MONDAY("Duishombu"),
   TUESDAY("Sheishembi"),
   WENDESDAY("Sharshembi"),
   THURSDAY("Beishembi"),
   FRIDAY("Juma"),
   SATYDAY("Ishembi"),
   SUNDAY("Jekshembi");
   private String translation;

   AptaKundor(String translation) {
      this.translation = translation;
   }

   public String getTranslation() {
      return translation;
   }

   public void setTranslation(String translation) {
      this.translation = translation;
   }
   
   @Override
   public String toString() {
      return "AptaKundor{" +
              "translation='" + translation + '\'' +
              '}';
   }
}
