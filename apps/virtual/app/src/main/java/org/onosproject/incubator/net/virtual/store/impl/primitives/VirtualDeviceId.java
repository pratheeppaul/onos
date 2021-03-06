/*
 * Copyright 2017-present Open Networking Foundation
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

package org.onosproject.incubator.net.virtual.store.impl.primitives;

import org.onosproject.incubator.net.virtual.NetworkId;
import org.onosproject.net.DeviceId;

import java.util.Objects;

/**
 * A wrapper class to isolate device id from other virtual networks.
 */
public class VirtualDeviceId {

    NetworkId networkId;
    DeviceId deviceId;

    public VirtualDeviceId(NetworkId networkId, DeviceId deviceId) {
        this.networkId = networkId;
        this.deviceId = deviceId;
    }

    public NetworkId networkId() {
        return networkId;
    }

    public DeviceId deviceId() {
        return deviceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkId, deviceId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof VirtualDeviceId) {
            VirtualDeviceId that = (VirtualDeviceId) obj;
            return this.deviceId.equals(that.deviceId) &&
                    this.networkId.equals(that.networkId);
        }
        return false;
    }
}

