/*
 * Copyright 2016 Benjamin Sautner
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.nimbits.client.service.value;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.nimbits.client.exception.ValueException;
import com.nimbits.client.model.calculation.Calculation;
import com.nimbits.client.model.entity.Entity;
import com.nimbits.client.model.point.Point;
import com.nimbits.client.model.user.User;
import com.nimbits.client.model.value.Value;

import java.util.List;
import java.util.Map;

public interface ValueServiceRpcAsync {
    void solveEquationRpc(final Calculation calculation, final AsyncCallback<List<Value>> async);

    void recordValueRpc(final Entity point, final Value value, final AsyncCallback<Void> asyncCallback) throws ValueException;

    void getCurrentValuesRpc(Map<String, Point> entities, AsyncCallback<Map<String, Entity>> async);

    void getChartTable(final User user, Entity entity, Integer count, AsyncCallback<String> asyncCallback);
}
