# How to use Gitlab Pipeline

## 1. Step 1:
  ### <u>Registering Runners</u> 
 
 Registering a Runner is the process that binds the Runner with a GitLab instance.

<u>Requirements :</u> 

- <u>Install GitLab Runner :</u>  GitLab Runner can be installed and used on GNU/Linux, macOS, FreeBSD, and Windows. There are three ways to install it. Use Docker, download a binary manually, or use a repository for rpm/deb packages. In the following link you can find information on the different installation methods. [Install GitLab Runner](https://docs.gitlab.com/runner/install/index.html)

- <u>Registering a specific Runner with a project registration token</u>
To create a specific Runner without having admin rights to the GitLab instance, visit the project you want to make the Runner work for in GitLab: 
    - Go to Settings > CI/CD to obtain the token

Finally, to register a Runner under specific SO go to: [Registering Runners](https://docs.gitlab.com/runner/register/)

## 2. Step 2:
### <u>Define image and services from .gitlab-ci.yml</u>

You can simply define an docker image that will be used for all jobs and a list of services that you want to use during build time. It is also possible to define different images and services per job. Or you can pass some extended configuration options for image and services.
If the runner have define tags, you must include the specific tag in the jobs.
By default, this file must go in the root directory of the repository. But you can set a custom path in: 
    
  - Go to Settings > CI/CD > General pipelines > Custom CI config path

For more information, check the site [Define image and services from .gitlab-ci.yml](https://docs.gitlab.com/ce/ci/docker/using_docker_images.html#define-image-and-services-in-configtoml)

Gitlab runner use docker images stored in Docker hub. So, is possible create your own docker image and load to Docker hub

### <u> Example of .gitlab-ci.yml</u>

<pre><code>image: binaghiandres/maven_chrome:testing

test:
  tags:
    - java      
  script: "mvn test"
</code></pre>

## 3. Step 3:
  With each push to the repository, will run the pipeline. But it is possible to skip, append `[skip ci]` onto your commit message to avoid triggering another build. 
  
  Also, can be run manually in: 
  - Go to CI / CD > Pipelines > Run Pipeline

  or schedule in:
  -  Go to CI / CD > Schedules


## <u> WorkFlow </u>

![WorkFlow](imagesDocs/pipelineFlow.png "WorkFlow")
