/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.charles7c.cnadmin.system.model.request;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import org.hibernate.validator.constraints.Length;

import top.charles7c.cnadmin.common.enums.GenderEnum;

/**
 * 修改基础信息
 *
 * @author Charles7c
 * @since 2023/1/7 23:08
 */
@Data
@Schema(description = "修改基础信息")
public class UpdateBasicInfoRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 昵称
     */
    @Schema(description = "昵称")
    @NotBlank(message = "昵称不能为空")
    @Length(max = 32, message = "昵称长度不能超过 {max} 个字符")
    private String nickname;

    /**
     * 性别（0未知 1男 2女）
     */
    @Schema(description = "性别（0未知 1男 2女）", type = "Integer", allowableValues = {"0", "1", "2"})
    @NotNull(message = "性别非法")
    private GenderEnum gender;
}
