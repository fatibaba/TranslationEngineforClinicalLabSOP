package Users.Nabila.OCLSOP;
/**
 * 
 * @author Emma Haddi
 *
 */
public class ProtocolBeans {
 private String actionStatement;
 private String title;
 private String action;
 private String mintemperature;
 private String maxtemperature;
 private String volume;
 private String entity;
 private String concentration;
 private String equipment;
 private String period;
 private String speed;
 private String condition;
 private StringBuilder note;
 private String method;
 private String density;
 private String actionSubject;
 private String synonym;
 

 public String getTitle() {
  return title;
 }
 public void setTitle(String title) {
  this.title = title;
 }
 public String getAction() {
  return action;
 }
 public void setAction(String action) {
  this.action = action;
 }

 public String getMinTemperature() {
  return mintemperature;
 }
 public void setMinTemperature(String temperature) {
  this.mintemperature = temperature;
 }
 public String getMaxTemperature() {
  return maxtemperature;
 }
 public void setMaxTemperature(String temperature) {
  this.maxtemperature = temperature;
 }
 public String getVolume() {
  return volume;
 }
 public void setVolume(String volume) {
  this.volume = volume;
 }
 public String getEntity() {
  return entity;
 }
 public void setEntity(String entity) {
  this.entity = entity;
 }
 public String getConcentration() {
  return concentration;
 }
 public void setConcentration(String concentration) {
  this.concentration = concentration;
 }
 public String getEquipment() {
  return equipment;
 }
 public void setEquipment(String equipment) {
  this.equipment = equipment;
 }
 public String getPeriod() {
  return period;
 }
 public void setPeriod(String period) {
  this.period = period;
 }
 public String getSpeed() {
  return speed;
 }
 public void setSpeed(String speed) {
  this.speed = speed;
 }
 public String getCondition() {
  return condition;
 }
 public void setCondition(String condition) {
  this.condition = condition;
 }
 public String getMethod() {
  return method;
 }
 public void setMethod(String method) {
  this.method = method;
 }
 public String getDensity() {
  return density;
 }
 public void setDensity(String density) {
  this.density = density;
 }
 public StringBuilder getNote() {
  return note;
 }
 public void setNote(StringBuilder note) {
  this.note = note;
 }
 
 public String getActionStatement() {
  return actionStatement;
 }
 public void setActionStatement(String actionStatement) {
  this.actionStatement = actionStatement;
 }
public String getActionSubject() {
  return actionSubject;
 }
 public void setActionSubject(String actionSubject) {
  this.actionSubject = actionSubject;
 }
public String getSynonym() {
  return synonym;
 }
 public void setSynonym(String actionSubject) {
  this.synonym = synonym;
 }
 public String printStructuredAction(){
  StringBuilder text = new StringBuilder();
  text.append(actionStatement).append(",");
  text.append(action==null?",": action + ",");
  text.append(entity==null?",":entity + ",");
  text.append(actionSubject==null?",":actionSubject + ",");
  text.append(mintemperature==null?",": mintemperature + ",");
  text.append(maxtemperature==null?",": maxtemperature + ",");
  text.append(volume==null?",": volume + ",");  
  text.append(concentration==null?",":"'"+concentration + ",");
  text.append(equipment==null?",": equipment + ",");
  text.append(period==null?",": period + ",");
  text.append(speed==null?",": speed + ",");
  text.append(condition==null?",":condition + ",");
  text.append(method==null?",": method+ ",");
  text.append(synonym==null?",": synonym+ ",");
  text.append(note==null?",":note);
  
  return text.toString();
 }

}
