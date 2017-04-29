package com.fcs.business.rest;

import com.fcs.business.entity.Sample;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by leave on 2017/4/29.
 */
@RequestMapping(value="/samples")
@RestController
public class SampleController {
    // 创建线程安全的Map 
    static Map<Long, Sample> samples = Collections.synchronizedMap(new HashMap<Long, Sample>());

    @ApiOperation(value="获取样例列表", notes="")
    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<Sample> getSampleList() {
        // 处理"/samples/"的GET请求，用来获取样例列表 
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递 
        List<Sample> r = new ArrayList<Sample>(samples.values());
        return r;
    }

    @ApiOperation(value="创建样例", notes="根据Sample对象创建样例")
    @ApiImplicitParam(name = "sample", value = "样例详细实体sample", required = true, dataType = "Sample")
    @RequestMapping(value="/", method=RequestMethod.POST)
    public String postSample(@ModelAttribute Sample sample) {
        // 处理"/samples/"的POST请求，用来创建Sample 
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数 
        samples.put(sample.getId(), sample);
        return "success";
    }
    @ApiOperation(value="获取样例详细信息", notes="根据url的id来获取样例详细信息")
    @ApiImplicitParam(name = "id", value = "样例ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Sample getSample(@PathVariable Long id) {
        // 处理"/samples/{id}"的GET请求，用来获取url中id值的Sample信息 
        // url中的id可通过@PathVariable绑定到函数的参数中 
        return samples.get(id);
    }

    @ApiOperation(value="更新样例详细信息", notes="根据url的id来指定更新对象，并根据传过来的sample信息来更新样例详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "样例ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "sample", value = "样例详细实体sample", required = true, dataType = "Sample")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putSample(@PathVariable Long id, @ModelAttribute Sample sample) {
        // 处理"/samples/{id}"的PUT请求，用来更新Sample信息 
        Sample u = samples.get(id);
        u.setName(sample.getName());
        u.setAge(sample.getAge());
        samples.put(id, u);
        return "success";
    }

    @ApiOperation(value="删除样例", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "样例ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteSample(@PathVariable Long id) {
        // 处理"/samples/{id}"的DELETE请求，用来删除Sample 
        samples.remove(id);
        return "success";
    }
}
