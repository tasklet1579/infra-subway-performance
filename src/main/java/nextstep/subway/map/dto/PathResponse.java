package nextstep.subway.map.dto;

import nextstep.subway.station.dto.StationResponse;

import java.io.Serializable;
import java.util.List;

public class PathResponse implements Serializable {
    private List<StationResponse> stations;
    private int distance;

    public PathResponse() {
    }

    public PathResponse(List<StationResponse> stations, int distance) {
        this.stations = stations;
        this.distance = distance;
    }

    public List<StationResponse> getStations() {
        return stations;
    }

    public int getDistance() {
        return distance;
    }
}
