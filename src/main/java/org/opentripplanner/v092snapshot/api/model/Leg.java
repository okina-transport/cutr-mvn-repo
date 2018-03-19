package org.opentripplanner.v092snapshot.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.patch.Alerts;
import org.opentripplanner.v092snapshot.util.model.EncodedPolylineBean;

public class Leg implements Serializable {
    private static final long serialVersionUID = -7657410568807464781L;
    public String startTime = null;
    public String endTime = null;
    public long duration;
    public Double distance = null;
    public String mode;
    public String route;
    public String agencyName;
    public String agencyUrl;
    public int agencyTimeZoneOffset;
    public String routeColor;
    public String routeId;
    public String routeTextColor;
    public Boolean interlineWithPreviousLeg;
    public String tripShortName;
    public String headsign;
    public String agencyId;
    public String tripId;
    public Place from;
    public Place to;
    @JsonProperty("intermediateStops")
    public List<Place> stop;
    public EncodedPolylineBean legGeometry;
    @JsonProperty("steps")
    public List<WalkStep> walkSteps;
    private List<Note> notes;
    private List<Alerts> alerts;
    public String routeShortName;
    public String routeLongName;
    public String boardRule;
    public String alightRule;
    public Boolean rentedBike;
    boolean bogusNonTransitLeg;

    public Leg() {
        this.mode = TraverseMode.WALK.toString();
        this.route = "";
        this.routeColor = null;
        this.routeId = null;
        this.routeTextColor = null;
        this.tripShortName = null;
        this.headsign = null;
        this.agencyId = null;
        this.tripId = null;
        this.from = null;
        this.to = null;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public long getDuration() {
        return this.duration;
    }

    public Double getDistance() {
        return this.distance;
    }

    public String getMode() {
        return this.mode;
    }

    public String getRoute() {
        return this.route;
    }

    public String getAgencyName() {
        return this.agencyName;
    }

    public String getAgencyUrl() {
        return this.agencyUrl;
    }

    public int getAgencyTimeZoneOffset() {
        return this.agencyTimeZoneOffset;
    }

    public String getRouteColor() {
        return this.routeColor;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public String getRouteTextColor() {
        return this.routeTextColor;
    }

    public Boolean getInterlineWithPreviousLeg() {
        return this.interlineWithPreviousLeg;
    }

    public String getTripShortName() {
        return this.tripShortName;
    }

    public String getHeadsign() {
        return this.headsign;
    }

    public String getAgencyId() {
        return this.agencyId;
    }

    public String getTripId() {
        return this.tripId;
    }

    public Place getFrom() {
        return this.from;
    }

    public Place getTo() {
        return this.to;
    }

    public EncodedPolylineBean getLegGeometry() {
        return this.legGeometry;
    }

    public String getRouteShortName() {
        return this.routeShortName;
    }

    public String getRouteLongName() {
        return this.routeLongName;
    }

    public String getBoardRule() {
        return this.boardRule;
    }

    public String getAlightRule() {
        return this.alightRule;
    }

    public Boolean getRentedBike() {
        return this.rentedBike;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setAgencyUrl(String agencyUrl) {
        this.agencyUrl = agencyUrl;
    }

    public void setAgencyTimeZoneOffset(int agencyTimeZoneOffset) {
        this.agencyTimeZoneOffset = agencyTimeZoneOffset;
    }

    public void setRouteColor(String routeColor) {
        this.routeColor = routeColor;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public void setRouteTextColor(String routeTextColor) {
        this.routeTextColor = routeTextColor;
    }

    public void setInterlineWithPreviousLeg(Boolean interlineWithPreviousLeg) {
        this.interlineWithPreviousLeg = interlineWithPreviousLeg;
    }

    public void setTripShortName(String tripShortName) {
        this.tripShortName = tripShortName;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public void setFrom(Place from) {
        this.from = from;
    }

    public void setTo(Place to) {
        this.to = to;
    }

    public void setLegGeometry(EncodedPolylineBean legGeometry) {
        this.legGeometry = legGeometry;
    }

    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    public void setRouteLongName(String routeLongName) {
        this.routeLongName = routeLongName;
    }

    public void setBoardRule(String boardRule) {
        this.boardRule = boardRule;
    }

    public void setAlightRule(String alightRule) {
        this.alightRule = alightRule;
    }

    public void setRentedBike(Boolean rentedBike) {
        this.rentedBike = rentedBike;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Leg)) {
            return false;
        } else {
            Leg other = (Leg)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label347: {
                    Object this$startTime = this.getStartTime();
                    Object other$startTime = other.getStartTime();
                    if (this$startTime == null) {
                        if (other$startTime == null) {
                            break label347;
                        }
                    } else if (this$startTime.equals(other$startTime)) {
                        break label347;
                    }

                    return false;
                }

                Object this$endTime = this.getEndTime();
                Object other$endTime = other.getEndTime();
                if (this$endTime == null) {
                    if (other$endTime != null) {
                        return false;
                    }
                } else if (!this$endTime.equals(other$endTime)) {
                    return false;
                }

                if (this.getDuration() != other.getDuration()) {
                    return false;
                } else {
                    label332: {
                        Object this$distance = this.getDistance();
                        Object other$distance = other.getDistance();
                        if (this$distance == null) {
                            if (other$distance == null) {
                                break label332;
                            }
                        } else if (this$distance.equals(other$distance)) {
                            break label332;
                        }

                        return false;
                    }

                    Object this$mode = this.getMode();
                    Object other$mode = other.getMode();
                    if (this$mode == null) {
                        if (other$mode != null) {
                            return false;
                        }
                    } else if (!this$mode.equals(other$mode)) {
                        return false;
                    }

                    Object this$route = this.getRoute();
                    Object other$route = other.getRoute();
                    if (this$route == null) {
                        if (other$route != null) {
                            return false;
                        }
                    } else if (!this$route.equals(other$route)) {
                        return false;
                    }

                    label311: {
                        Object this$agencyName = this.getAgencyName();
                        Object other$agencyName = other.getAgencyName();
                        if (this$agencyName == null) {
                            if (other$agencyName == null) {
                                break label311;
                            }
                        } else if (this$agencyName.equals(other$agencyName)) {
                            break label311;
                        }

                        return false;
                    }

                    label304: {
                        Object this$agencyUrl = this.getAgencyUrl();
                        Object other$agencyUrl = other.getAgencyUrl();
                        if (this$agencyUrl == null) {
                            if (other$agencyUrl == null) {
                                break label304;
                            }
                        } else if (this$agencyUrl.equals(other$agencyUrl)) {
                            break label304;
                        }

                        return false;
                    }

                    if (this.getAgencyTimeZoneOffset() != other.getAgencyTimeZoneOffset()) {
                        return false;
                    } else {
                        label296: {
                            Object this$routeColor = this.getRouteColor();
                            Object other$routeColor = other.getRouteColor();
                            if (this$routeColor == null) {
                                if (other$routeColor == null) {
                                    break label296;
                                }
                            } else if (this$routeColor.equals(other$routeColor)) {
                                break label296;
                            }

                            return false;
                        }

                        Object this$routeId = this.getRouteId();
                        Object other$routeId = other.getRouteId();
                        if (this$routeId == null) {
                            if (other$routeId != null) {
                                return false;
                            }
                        } else if (!this$routeId.equals(other$routeId)) {
                            return false;
                        }

                        label282: {
                            Object this$routeTextColor = this.getRouteTextColor();
                            Object other$routeTextColor = other.getRouteTextColor();
                            if (this$routeTextColor == null) {
                                if (other$routeTextColor == null) {
                                    break label282;
                                }
                            } else if (this$routeTextColor.equals(other$routeTextColor)) {
                                break label282;
                            }

                            return false;
                        }

                        Object this$interlineWithPreviousLeg = this.getInterlineWithPreviousLeg();
                        Object other$interlineWithPreviousLeg = other.getInterlineWithPreviousLeg();
                        if (this$interlineWithPreviousLeg == null) {
                            if (other$interlineWithPreviousLeg != null) {
                                return false;
                            }
                        } else if (!this$interlineWithPreviousLeg.equals(other$interlineWithPreviousLeg)) {
                            return false;
                        }

                        label268: {
                            Object this$tripShortName = this.getTripShortName();
                            Object other$tripShortName = other.getTripShortName();
                            if (this$tripShortName == null) {
                                if (other$tripShortName == null) {
                                    break label268;
                                }
                            } else if (this$tripShortName.equals(other$tripShortName)) {
                                break label268;
                            }

                            return false;
                        }

                        Object this$headsign = this.getHeadsign();
                        Object other$headsign = other.getHeadsign();
                        if (this$headsign == null) {
                            if (other$headsign != null) {
                                return false;
                            }
                        } else if (!this$headsign.equals(other$headsign)) {
                            return false;
                        }

                        Object this$agencyId = this.getAgencyId();
                        Object other$agencyId = other.getAgencyId();
                        if (this$agencyId == null) {
                            if (other$agencyId != null) {
                                return false;
                            }
                        } else if (!this$agencyId.equals(other$agencyId)) {
                            return false;
                        }

                        label247: {
                            Object this$tripId = this.getTripId();
                            Object other$tripId = other.getTripId();
                            if (this$tripId == null) {
                                if (other$tripId == null) {
                                    break label247;
                                }
                            } else if (this$tripId.equals(other$tripId)) {
                                break label247;
                            }

                            return false;
                        }

                        label240: {
                            Object this$from = this.getFrom();
                            Object other$from = other.getFrom();
                            if (this$from == null) {
                                if (other$from == null) {
                                    break label240;
                                }
                            } else if (this$from.equals(other$from)) {
                                break label240;
                            }

                            return false;
                        }

                        label233: {
                            Object this$to = this.getTo();
                            Object other$to = other.getTo();
                            if (this$to == null) {
                                if (other$to == null) {
                                    break label233;
                                }
                            } else if (this$to.equals(other$to)) {
                                break label233;
                            }

                            return false;
                        }

                        Object this$stop = this.getStop();
                        Object other$stop = other.getStop();
                        if (this$stop == null) {
                            if (other$stop != null) {
                                return false;
                            }
                        } else if (!this$stop.equals(other$stop)) {
                            return false;
                        }

                        label219: {
                            Object this$legGeometry = this.getLegGeometry();
                            Object other$legGeometry = other.getLegGeometry();
                            if (this$legGeometry == null) {
                                if (other$legGeometry == null) {
                                    break label219;
                                }
                            } else if (this$legGeometry.equals(other$legGeometry)) {
                                break label219;
                            }

                            return false;
                        }

                        label212: {
                            Object this$walkSteps = this.getWalkSteps();
                            Object other$walkSteps = other.getWalkSteps();
                            if (this$walkSteps == null) {
                                if (other$walkSteps == null) {
                                    break label212;
                                }
                            } else if (this$walkSteps.equals(other$walkSteps)) {
                                break label212;
                            }

                            return false;
                        }

                        Object this$notes = this.getNotes();
                        Object other$notes = other.getNotes();
                        if (this$notes == null) {
                            if (other$notes != null) {
                                return false;
                            }
                        } else if (!this$notes.equals(other$notes)) {
                            return false;
                        }

                        label198: {
                            Object this$alerts = this.getAlerts();
                            Object other$alerts = other.getAlerts();
                            if (this$alerts == null) {
                                if (other$alerts == null) {
                                    break label198;
                                }
                            } else if (this$alerts.equals(other$alerts)) {
                                break label198;
                            }

                            return false;
                        }

                        label191: {
                            Object this$routeShortName = this.getRouteShortName();
                            Object other$routeShortName = other.getRouteShortName();
                            if (this$routeShortName == null) {
                                if (other$routeShortName == null) {
                                    break label191;
                                }
                            } else if (this$routeShortName.equals(other$routeShortName)) {
                                break label191;
                            }

                            return false;
                        }

                        Object this$routeLongName = this.getRouteLongName();
                        Object other$routeLongName = other.getRouteLongName();
                        if (this$routeLongName == null) {
                            if (other$routeLongName != null) {
                                return false;
                            }
                        } else if (!this$routeLongName.equals(other$routeLongName)) {
                            return false;
                        }

                        Object this$boardRule = this.getBoardRule();
                        Object other$boardRule = other.getBoardRule();
                        if (this$boardRule == null) {
                            if (other$boardRule != null) {
                                return false;
                            }
                        } else if (!this$boardRule.equals(other$boardRule)) {
                            return false;
                        }

                        label170: {
                            Object this$alightRule = this.getAlightRule();
                            Object other$alightRule = other.getAlightRule();
                            if (this$alightRule == null) {
                                if (other$alightRule == null) {
                                    break label170;
                                }
                            } else if (this$alightRule.equals(other$alightRule)) {
                                break label170;
                            }

                            return false;
                        }

                        Object this$rentedBike = this.getRentedBike();
                        Object other$rentedBike = other.getRentedBike();
                        if (this$rentedBike == null) {
                            if (other$rentedBike != null) {
                                return false;
                            }
                        } else if (!this$rentedBike.equals(other$rentedBike)) {
                            return false;
                        }

                        if (this.isBogusNonTransitLeg() != other.isBogusNonTransitLeg()) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Leg;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        Object $startTime = this.getStartTime();
        int result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
        Object $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : $endTime.hashCode());
        long $duration = this.getDuration();
        result = result * 59 + (int)($duration >>> 32 ^ $duration);
        Object $distance = this.getDistance();
        result = result * 59 + ($distance == null ? 43 : $distance.hashCode());
        Object $mode = this.getMode();
        result = result * 59 + ($mode == null ? 43 : $mode.hashCode());
        Object $route = this.getRoute();
        result = result * 59 + ($route == null ? 43 : $route.hashCode());
        Object $agencyName = this.getAgencyName();
        result = result * 59 + ($agencyName == null ? 43 : $agencyName.hashCode());
        Object $agencyUrl = this.getAgencyUrl();
        result = result * 59 + ($agencyUrl == null ? 43 : $agencyUrl.hashCode());
        result = result * 59 + this.getAgencyTimeZoneOffset();
        Object $routeColor = this.getRouteColor();
        result = result * 59 + ($routeColor == null ? 43 : $routeColor.hashCode());
        Object $routeId = this.getRouteId();
        result = result * 59 + ($routeId == null ? 43 : $routeId.hashCode());
        Object $routeTextColor = this.getRouteTextColor();
        result = result * 59 + ($routeTextColor == null ? 43 : $routeTextColor.hashCode());
        Object $interlineWithPreviousLeg = this.getInterlineWithPreviousLeg();
        result = result * 59 + ($interlineWithPreviousLeg == null ? 43 : $interlineWithPreviousLeg.hashCode());
        Object $tripShortName = this.getTripShortName();
        result = result * 59 + ($tripShortName == null ? 43 : $tripShortName.hashCode());
        Object $headsign = this.getHeadsign();
        result = result * 59 + ($headsign == null ? 43 : $headsign.hashCode());
        Object $agencyId = this.getAgencyId();
        result = result * 59 + ($agencyId == null ? 43 : $agencyId.hashCode());
        Object $tripId = this.getTripId();
        result = result * 59 + ($tripId == null ? 43 : $tripId.hashCode());
        Object $from = this.getFrom();
        result = result * 59 + ($from == null ? 43 : $from.hashCode());
        Object $to = this.getTo();
        result = result * 59 + ($to == null ? 43 : $to.hashCode());
        Object $stop = this.getStop();
        result = result * 59 + ($stop == null ? 43 : $stop.hashCode());
        Object $legGeometry = this.getLegGeometry();
        result = result * 59 + ($legGeometry == null ? 43 : $legGeometry.hashCode());
        Object $walkSteps = this.getWalkSteps();
        result = result * 59 + ($walkSteps == null ? 43 : $walkSteps.hashCode());
        Object $notes = this.getNotes();
        result = result * 59 + ($notes == null ? 43 : $notes.hashCode());
        Object $alerts = this.getAlerts();
        result = result * 59 + ($alerts == null ? 43 : $alerts.hashCode());
        Object $routeShortName = this.getRouteShortName();
        result = result * 59 + ($routeShortName == null ? 43 : $routeShortName.hashCode());
        Object $routeLongName = this.getRouteLongName();
        result = result * 59 + ($routeLongName == null ? 43 : $routeLongName.hashCode());
        Object $boardRule = this.getBoardRule();
        result = result * 59 + ($boardRule == null ? 43 : $boardRule.hashCode());
        Object $alightRule = this.getAlightRule();
        result = result * 59 + ($alightRule == null ? 43 : $alightRule.hashCode());
        Object $rentedBike = this.getRentedBike();
        result = result * 59 + ($rentedBike == null ? 43 : $rentedBike.hashCode());
        result = result * 59 + (this.isBogusNonTransitLeg() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "Leg(startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", duration=" + this.getDuration() + ", distance=" + this.getDistance() + ", mode=" + this.getMode() + ", route=" + this.getRoute() + ", agencyName=" + this.getAgencyName() + ", agencyUrl=" + this.getAgencyUrl() + ", agencyTimeZoneOffset=" + this.getAgencyTimeZoneOffset() + ", routeColor=" + this.getRouteColor() + ", routeId=" + this.getRouteId() + ", routeTextColor=" + this.getRouteTextColor() + ", interlineWithPreviousLeg=" + this.getInterlineWithPreviousLeg() + ", tripShortName=" + this.getTripShortName() + ", headsign=" + this.getHeadsign() + ", agencyId=" + this.getAgencyId() + ", tripId=" + this.getTripId() + ", from=" + this.getFrom() + ", to=" + this.getTo() + ", stop=" + this.getStop() + ", legGeometry=" + this.getLegGeometry() + ", walkSteps=" + this.getWalkSteps() + ", notes=" + this.getNotes() + ", alerts=" + this.getAlerts() + ", routeShortName=" + this.getRouteShortName() + ", routeLongName=" + this.getRouteLongName() + ", boardRule=" + this.getBoardRule() + ", alightRule=" + this.getAlightRule() + ", rentedBike=" + this.getRentedBike() + ", bogusNonTransitLeg=" + this.isBogusNonTransitLeg() + ")";
    }

    public List<Place> getStop() {
        return this.stop;
    }

    public void setStop(List<Place> stop) {
        this.stop = stop;
    }

    public List<WalkStep> getWalkSteps() {
        return this.walkSteps;
    }

    public void setWalkSteps(List<WalkStep> walkSteps) {
        this.walkSteps = walkSteps;
    }

    public List<Note> getNotes() {
        return this.notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Alerts> getAlerts() {
        return this.alerts;
    }

    public void setAlerts(List<Alerts> alerts) {
        this.alerts = alerts;
    }

    public boolean isBogusNonTransitLeg() {
        return this.bogusNonTransitLeg;
    }

    public void setBogusNonTransitLeg(boolean bogusNonTransitLeg) {
        this.bogusNonTransitLeg = bogusNonTransitLeg;
    }
}
