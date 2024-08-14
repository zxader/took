package com.took.positionsave_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PositionUserListRequest {

    @Schema(description = "사용자 ID", example = "12345")
    private Long userSeq;  // 사용자 ID

    @Schema(description = "위치의 위도", example = "37.5665")
    private double lat;    // 위치의 위도 정보

    @Schema(description = "위치의 경도", example = "126.978")
    private double lon;    // 위치의 경도 정보
}