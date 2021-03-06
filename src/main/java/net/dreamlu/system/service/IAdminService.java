/*
 * Copyright (c) 2019-2029, Dreamlu 卢春梦 (596392912@qq.com & www.dreamlu.net).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dreamlu.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import net.dreamlu.system.model.Admin;
import net.dreamlu.system.vo.AdminVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author L.cm
 * @since 2018-01-29
 */
public interface IAdminService extends IService<Admin> {

	/**
	 * 根据用户名查找用户
	 * @param username 用户名
	 * @return 用户
	 */
	Admin findByName(String username);

	IPage<AdminVO> finalDataGrid(AdminVO adminVO, IPage<Admin> pages);

	boolean insertByVo(AdminVO adminVO);

	boolean updateByVo(AdminVO adminVO);
}
